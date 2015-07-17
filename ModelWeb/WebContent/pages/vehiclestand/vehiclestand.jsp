<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vehicle Stand</title>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.4.js"></script>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style/controls.css" />

<script type="text/javascript">
	$(document).ready(function() {
		$('#isTokenLost').click(function() {
			var status = $('#isTokenLost').is(':checked');
			if (status) {
				$('#divIsTokenLost').show();
			} else {
				$('#divIsTokenLost').hide();
			}
		});

		var vehicleId = $('#vehicleId').val();
		if (vehicleId == '') {
			$('#divOutTime').hide();
		} else {
			$('#divOutTime').show();
		}
	});

	function updateTime() {
		var date = new Date();
		var time = date.toLocaleTimeString();
		$('#inTime').val(time);
	}

	setInterval(updateTime, 1000);
</script>

</head>

<body>
	<div align="center">
		<label>${message }</label>
	</div>
	<div>
		<div>
			<input id="vehicleId" name="vehicleId" value="${vehicleBean.vehicleId }" type="hidden" />
		</div>
		<div style="float: left; width: 250px;">
			<span style="color: red">*</span> <label>Registration Number</label>
		</div>
		<div>
			<input id="registrationNumber" name="registrationNumber" value="${vehicleBean.registrationNumber }" />
		</div>
		<div style="float: left; width: 250px;">
			<span style="color: red">*</span> <label>Vehicle Type</label>
		</div>
		<div>
			<select class="select140px">
				<option id="0">-- Select --</option>
				<option value="${vehicleBean.vehicleTypes }"></option>
			</select>
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<span style="color: red;">*</span><label>In Time</label>
		</div>
		<div>
			<input id="inTime" value="${vehicleBean.inTime }" name="inTime" readonly="readonly" class="width75px" />
		</div>
		<div id="divOutTime">
			<div style="float: left; width: 250px; clear: left;">
				<span style="color: red;">*</span><label>Out Time</label>
			</div>
			<div>
				<input id="outTime" name="outTime" value="${vehicleBean.outTime }" />
			</div>
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<span style="color: white;">*</span><label>Is MonthlyPass</label>
		</div>
		<div>
			<input type="checkbox" value="${vehicleBean.isMonthlyPass }" />
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<span style="color: white;">*</span><label>Is Token Lost</label>
		</div>
		<div>
			<input id="isTokenLost" name="isTokenLost" type="checkbox" value="${vehicleBean.isTokenLost }" />
		</div>
		<div id="divIsTokenLost" style="display: none;">
			<div style="float: left; width: 250px; clear: left;">
				<span style="color: red;">*</span><label>Name</label>
			</div>
			<div>
				<input value="${vehicleBean.name }" />
			</div>
			<div style="float: left; width: 250px; clear: left;">
				<span style="color: red;">*</span><label>Phone Number</label>
			</div>
			<div>
				<input value="${vehicleBean.phoneNumber }" />
			</div>
			<div style="float: left; width: 250px; clear: left;">
				<span style="color: red;">*</span><label>Address</label>
			</div>
			<div>
				<input value="${vehicleBean.address }" />
			</div>
		</div>
	</div>
</body>
</html>