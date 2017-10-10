# xiaobai
1. task scheduler 每2/3秒去请求数据
2. 获得请求数据与未开奖的进行期号匹配，匹配成功获得开奖数据
3. 把该期开奖数据发关到kafka(topic: draw.result.topic)



