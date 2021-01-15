// 柱状图表，列多柱
var chartColumnar_column = {
    color:[
        "#87cefa", "#e73f60","#f2b71d"
    ],
    legend: {
        top: 10,
        textStyle: {
            color: "#fff"
        }
    },
    grid: {
        top: 30,
        left: 10,
        right: 10,
        bottom: 20,
        containLabel: true,
        width: 'auto',
        height: 'auto',
    },
    tooltip: {},
    dataset: {
        dimensions: ['product', 'DTF', 'UTF', '故指'],
        source: [
            {product: '厂家1', 'DTF': 43.3, 'UTF': 85.8, '故指': 93.7},
            {product: '厂家2', 'DTF': 83.1, 'UTF': 73.4, '故指': 55.1},
            {product: '厂家3', 'DTF': 86.4, 'UTF': 65.2, '故指': 82.5},
            {product: '厂家4', 'DTF': 72.4, 'UTF': 53.9, '故指': 39.1}
        ]
    },
    textStyle: {
        color: "#fff"
    },
    xAxis: {
        type: 'category',
        axisLine: {
            lineStyle: {
                color: "#fff",
            }
        }
    },
    yAxis: {
        axisLine: {
            lineStyle: {
                color: "#fff",
            }
        },
        splitLine: {
            show: true,
            lineStyle: {
                color: "#333",
                type: 'solid'
            }
        }
    },
    series: [
        {
            type: 'bar',
            barWidth: '18%'
        },
        {
            type: 'bar',
            barWidth: '18%'
        },
        {
            type: 'bar',
            barWidth: '18%'
        }
    ]
};

//饼状图表，环形
var chartCake_ringy1 = {
    grid: {
        containLabel: true,
        width: 'auto',
        height: 'auto',
    },
    color:[
        "#e73f60", "#65c233"
    ],
    tooltip: {
        show: true,
        formatter: ""
    },
    series: [
        {
            name:"",
            type: 'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: true,
            label: {
                show: true,
                position: 'outside',
                color: "#fff",
                fontSize: 18,
                formatter: '{b}\n{c}\%'
            },
            labelLine: {
                lineStyle: {
                    color: "#fff",
                }
            },
            data: [
                {value: 30, name: '未成功'},
                {value: 70, name: '成功'}
            ]
        }
    ]
};

var chartCake_ringy2 = {
    grid: {
        containLabel: true,
        width: 'auto',
        height: 'auto',
    },
    color:[
        "#e73f60", "#65c233"
    ],
    tooltip: {
        show: true,
        formatter: ""
    },
    series: [
        {
            name:"",
            type: 'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: true,
            label: {
                show: true,
                position: 'outside',
                color: "#fff",
                fontSize: 18,
                formatter: '{b}\n{c}\%'
            },
            labelLine: {
                lineStyle: {
                    color: "#fff",
                }
            },
            data: [
                {value: 70, name: '未成功'},
                {value: 30, name: '成功'}
            ]
        }
    ]
};
//饼状图表
var chartCake_circular = {
    color:[
        "#87cefa", "#e73f60","#f2b71d","#65c233"
    ],
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    series: [
        {
            name: '介质统计',
            type: 'pie',
            radius: '70%',
            center: ['50%', '50%'],
            label: {
                color: "#fff",
                formatter: "{b}\n{c}\%"
            },
            labelLine: {
                lineStyle: {
                    color: "#fff"
                }
            },
            data: [
                {value: 10, name: '无线公网'},
                {value: 20, name: '无线专网'},
                {value: 30, name: '光仟'},
                {value: 40, name: '载波'}
            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};

//柱状图表，行多柱
var chartColumnar_row = {
    color:[
        "#65c233", "#e73f60"
    ],
    grid: {
        top: 30,
        left: 10,
        right: 10,
        bottom: 20,
        containLabel: true,
        width: 'auto',
        height: 'auto',
    },
    tooltip: {
        trigger: 'axis',
        axisPointer: {
            type: 'shadow'
        }
    },
    legend: {
        top: 10,
        textStyle: {
            color: "#fff"
        }
    },
    toolbox: {
        show: true
    },
    calculable: true,
    xAxis: {
        axisLabel: {
            color: "#fff"
        },
        splitLine: {
            show: true,
            lineStyle: {
                color: "#333",
                type: 'solid'
            }
        },
        axisLine: {
            lineStyle: {
                color: "#fff"
            }
        }
    },
    yAxis: {
        axisLabel: {
            color: "#fff"
        },
        axisLine: {
            lineStyle: {
                color: "#fff"
            }
        },
        type: 'category'
    },
    dataset: {
        dimensions: ['product', '在线', '离线'],
        source: [
            {product: '厂家1', '在线': 43.3, '离线': 85.8},
            {product: '厂家2', '在线': 83.1, '离线': 73.4},
            {product: '厂家3', '在线': 86.4, '离线': 65.2},
            {product: '厂家4', '在线': 72.4, '离线': 53.9}
        ]
    },
    series: [
        {
            itemStyle: {normal: {label: {show: true, position: 'insideRight'}}},
            type: 'bar'
        },
        {
            itemStyle: {normal: {label: {show: true, position: 'insideRight'}}},
            type: 'bar'
        }
    ]
};

//饼状图表，南丁格尔
var chartCake_nightingale = {
    color:[
       "#87cefa", "#e73f60","#ff7f50",
    ],
    grid: {
        top: 0,
        left: 0,
        right: 0,
        bottom: 0,
        containLabel: true,
        width: 'auto',
        height: 'auto',
    },
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    calculable: true,
    series: [
        {
            name: '终端缺陷统计',
            type: 'pie',
            radius: [30, 90],
            center: ['50%', '50%'],
            roseType: 'area',
            label: {
                color: "#fff",
                formatter: "{b} \n{c} \%"
            },
            labelLine: {
                lineStyle: {
                    color: "#fff",
                }
            },
            data: [
                {value: 10, name: 'DTU'},
                {value: 5, name: 'FTU'},
                {value: 15, name: '故指'}
            ]
        }
    ]
};

//地图,江西
var map_jiangxi = {
    geo: {
        show: true,
        map: '江西',
        zoom: 1.2,
        itemStyle: {
            normal: {
                areaColor: '#01215c',
                borderWidth: 10,//设置外层边框
                borderColor: '#0b0d72',
                shadowColor: 'rgba(0,54,255, 1)',
                shadowBlur: 10
            }
        }
    },
    tooltip: {
        trigger: 'item',
        formatter: "{b},{c}"
    },
    series: [
        {
            name: '数据名称',
            type: 'map',
            mapType: '江西',
            zoom: 1.2,
            selectedMode: 'single',
            itemStyle: {
                normal: {
                    label: {
                        show: true,
                        textStyle: {
                            color: '#fff'
                        }
                    },
                    areaColor: "#3434ea",
                    borderWidth: 1.2,
                    borderColor: "#8e8efa"
                },
                emphasis: {
                    label: {
                        show: true,
                        color: "#fff"
                    }
                },
            },
            data: [
                {name: '南昌市', value: 500},
                {name: '九江市', value: 600},
                {name: '上饶市', value: 700},
                {name: '景德镇市', value: 200},
                {name: '宜春市', value: 600},
                {name: '抚州市', value: 500},
                {name: '吉安市', value: 700},
                {name: '新余市', value: 200},
                {name: '鹰潭市', value: 300},
                {name: '赣州市', value: 800},
                {name: '萍乡市', value: 200},
            ]
        }
    ]
};