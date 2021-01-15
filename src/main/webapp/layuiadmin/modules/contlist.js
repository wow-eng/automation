/**

 @Name：layuiAdmin 内容系统
 @Author：star1029
 @Site：http://www.layui.com/admin/
 @License：LPPL
    
 */


layui.define(['table', 'form'], function(exports){
  var $ = layui.$
  ,table = layui.table
  ,form = layui.form;

  //申报管理
  table.render({
    elem: '#LAY-app-content-list'
    ,url: layui.setter.base + 'json/content/list.js' //模拟接口
    ,cols: [[
       {type: 'checkbox'}
      ,{field: 'jihua-id', width: 100, title: 'ID', sort: true}
      ,{field: 'jihua-sgs', title: '市公司', minWidth: 200}
      ,{field: 'jihua-xgs', width: 200,title: '县公司'}
      ,{field: 'jihua-xmmc', width: 300 ,title: '项目名称'}
	  ,{field: 'jihua-gclx', width: 100 ,title: '工程类型'}
	  ,{field: 'jihua-cgdata', width: 200 ,title: '采购合同签订时间'}
	  ,{field: 'jihua-gysmc', width: 100 ,title: '供应商名称'}
	  ,{field: 'jihua-lxr', width: 100 ,title: '联系人'}
	  ,{field: 'jihua-dianhua', width: 100 ,width: 100 ,title: '电话'}
	  ,{field: 'jihua-zdlx', width: 100 ,title: '终端类型'}
	  ,{field: 'jihua-zdxh', width: 100 ,title: '终端型号'}
	  ,{field: 'jihua-zdsl', width: 100 ,title: '终端数量'}
	  ,{field: 'jihua-jsxytz', width: 200 ,title: '技术协议是否调整'}
	  ,{field: 'jihua-jsxysl', width: 200 ,title: '技术内容及涉及终端数量'}
	  ,{field: 'jihua-cjpcqk', width: 100 ,title: '厂家排产情况'}
	  ,{field: 'jihua-tddata', width: 100 ,title: '本月计划停电时间'}
	  ,{field: 'jihua-tddatasl', width: 200 ,title: '本月计划停电时间内所需配套终端数量'}
	  ,{field: 'jihua-mgyh', width: 200 ,title: '是否涉及重要负荷、敏感用户'}
	  ,{field: 'jihua-mgyhsl', width: 200 ,title: '是否涉及重要负荷、敏感用户配套的终端数量'}
      ,{field: 'jihua-uploadtime', width: 100 ,title: '创建时间', sort: true}
      ,{field: 'status', title: '状态',fixed: 'right', templet: '#buttonTpl', minWidth: 80, align: 'center'}
      ,{title: '操作', minWidth: 150, align: 'center', fixed: 'right', toolbar: '#table-content-list'}
    ]]
    ,page: true
    ,limit: 20
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
  });
  
  //监听工具条
  table.on('tool(LAY-app-content-list)', function(obj){
    var data = obj.data;
	alert(obj.event);
    if(obj.event === 'del'){
      layer.confirm('确定提交该条数据？', function(index){
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
      var index = layer.open({
        type: 2
		,skin: 'layui-layer-molv'
        ,title: '编辑计划'
        ,content: '../../../views/app/report/listform.html?id='+ data.id
        ,maxmin: true
        ,area: ['550px', '550px']
        ,btn: ['确定', '取消']
        ,yes: function(index, layero){
          var iframeWindow = window['layui-layer-iframe'+ index]
          ,submit = layero.find('iframe').contents().find("#layuiadmin-app-form-edit");

          //监听提交
          iframeWindow.layui.form.on('submit(layuiadmin-app-form-edit)', function(data){
            var field = data.field; //获取提交的字段
            
            //提交 Ajax 成功后，静态更新表格中的数据
            //$.ajax({});              
            obj.update({
              label: field.label
              ,title: field.title
              ,author: field.author
              ,status: field.status
            }); //数据更新
            
            form.render();
            layer.close(index); //关闭弹层
          });  
          
          submit.trigger('click');
        }
      });
	  layer.full(index);
    }
  });



  exports('contlist', {})
});