//配网终端数量统计
function pwzdsltj(paramvalues){
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
        dimensions: ['product', 'DTU', 'FTU', '故障指示器'],
        source:paramvalues
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
       var myChartColumnar_column1 = echarts.init(document.getElementById('chartColumnar_column1'));
       myChartColumnar_column1.setOption(chartColumnar_column);
}
  
 //遥信成功率
 function yxcgl(paramvalues){
    
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
            data:paramvalues
        }
    ]
};
     var myChartCake_ringy1 = echarts.init(document.getElementById('chartCake_ringy1'));
        myChartCake_ringy1.setOption(chartCake_ringy1);
 }
 
//遥控成功率
function ykcgl(paramvalues){
 
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
            data:paramvalues
        }
    ]
};

var myChartCake_ringy1 = echarts.init(document.getElementById('chartCake_ringy2'));
myChartCake_ringy1.setOption(chartCake_ringy2);
}








//介质
function  tjchanTypeSl(paramvalues){
  
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
            data: paramvalues,
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
 //介质统计
	var myChartCake_circular1 = echarts.init(document.getElementById('chartCake_circular1'));
	myChartCake_circular1.setOption(chartCake_circular);
}
//终端平均在线率
function zdpjzxl(paramvalues){

 
//饼状图表
var chartColumnar_column = {
    color:[
        "#ff7f50","#87cefa","#65c233", "#e73f60",
    ],
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    series: [
        {
            name: '终端平均在线率',
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
            data: paramvalues,
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
 
      var myChartColumnar_column1 = echarts.init(document.getElementById('chartColumnar_row1'));
      myChartColumnar_column1.setOption(chartColumnar_column);
 

}
//终端缺陷统计
function zdqxtj(){
 
 
 
//饼状图表
var chartCake_nightingale = {
    color:[
        "#87cefa", "#e73f60","#ff7f50", "#e73f60",
    ],
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    series: [
        {
            name: '终端缺陷统计',
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
            data:[
                {value: 10, name: 'DTU'},
                {value: 35, name: 'FTU'},
                {value: 55, name: '故指'}
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
 
   

//终端缺陷统计
var myChartCake_nightingale1 = echarts.init(document.getElementById('chartCake_nightingale1'));
myChartCake_nightingale1.setOption(chartCake_nightingale);


}




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