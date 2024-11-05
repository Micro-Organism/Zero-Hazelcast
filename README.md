# Zero-Hazelcast
Zero-Hazelcast
# 1. 概述
## 1.1. 简介
> Hazelcast是Hazelcast公司开源的一款分布式内存数据库产品，提供弹性可扩展、高性能的分布式内存计算。
> 并通过提供诸如Map，Queue，ExecutorService，Lock和JCache等Java的许多开发人员友好的分布式实现。
## 1.2. 特点
> 1. Hazelcast提供开源版本。 
> 2. Hazelcast无需安装，只是个极小jar包。 
> 3. Hazelcast提供开箱即用的分布式数据结构，如Map，Queue，MultiMap，Topic，Lock和Executor。 
> 4. Hazelcast集群非传统主从关系，避免了单点故障；集群中所有成员共同分担集群功能。 
> 5. Hazelcast集群提供弹性扩展，新成员在内存不足或负载过高时能动态加入集群。 
> 6. Hazelcast集群中成员分担数据缓存的同时互相冗余备份其他成员数据，防止某成员离线后数据丢失。 
> 7. Hazelcast提供SPI接口支持用户自定义分布式数据结构。
## 1.3. 场景
> 1. 频繁读写数据 
> 2. 需要高可用分布式缓存 
> 3. 内存行NoSql存储 
> 4. 分布式环境中弹性扩展

# 2. 功能

# 3. 使用
## 3.1. 安装
### 3.1.1. 拉取 hazelcast/management-center:5.3.0 镜像
```shell
docker pull hazelcast/management-center:5.3.0
```
### 3.1.2. Docker run 启动管理平台
```shell
docker run  -d -p 5880:8080 --name hazelcast5.3.0  hazelcast/management-center:5.3.0
```

# 4. 其他

# 5. 参考