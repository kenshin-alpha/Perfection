import psutil

print(psutil.cpu_percent(1))
print(psutil.cpu_count())
print(psutil.virtual_memory())
print(psutil.disk_partitions())
print(psutil.disk_usage('/'))
#print(psutil.net_connections())
#print(psutil.net_if_addrs())
print(psutil.sensors_battery())
print(psutil.sensors_temperatures())
print(psutil.sensors_fans())