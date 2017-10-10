# 开奖流程

<h4>lott-task</h4>
1. task scheduler 每2/3秒去请求开奖数据
2. 获得请求数据与未开奖的进行期号匹配，匹配成功获得开奖数据
3. 把该期开奖数据发关到kafka(topic: draw.result.topic)

<h4>lott-listener</h4>
1. 接收到派彩数据(topic: draw.result.topic)
2. 从redis中获得该期彩票订单数据
3. 循环处理订单发送到kafka(topic: bet.result.enriched.order.topic)
4. 从redis删除该订单


追号功能<br />
1. 从redis获得该彩种的追号订单
2. 处理追号订单 -> 发送订单到(topic: bet.result.enriched.order.topic)

<h4>opendraw-order-processor<h4>
1. 从kafka接收订单(topic: bet.result.enriched.order.topic)
2. 1. 处理追号订单
    2. 处理派彩订单
    
3. 处理订单是否中奖
4. 更新中奖排行榜
5. 发送奖金及打码量到kafka(balance服务：opendraw.cash.movement.topic)
 






