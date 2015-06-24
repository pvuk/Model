<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bike Stand</title>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-2.1.4.js"></script>

<script type="text/javascript">
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
		<div style="float: left; width: 250px;">
			<span style="color: red">*</span> <label>Registration Number</label>
		</div>
		<div>
			<input value="${vehicleBean.registrationNumber }" />
		</div>
		<div style="float: left; width: 250px;">
			<span style="color: red">*</span> <label>Vehicle Type</label>
		</div>
		<div>
			<select>
				<option value="${vehicleBean.vehicleTypes }"></option>
			</select>
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<span style="color: white;">*</span><label>Name</label>
		</div>
		<div>
			<input value="${vehicleBean.name }" />
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<label>Phone Number</label>
		</div>
		<div>
			<input value="${vehicleBean.phoneNumber }" />
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<label>Address</label>
		</div>
		<div>
			<input value="${vehicleBean.address }" />
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<label>In Time</label>
		</div>
		<div>
			<input id="inTime" value="${vehicleBean.inTime }" name="inTime"
				readonly="readonly" />
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<label>Out Time</label>
		</div>
		<div>
			<input value="${vehicleBean.outTime }" />
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<label>Is TokenGiven</label>
		</div>
		<div>
			<input type="checkbox" value="${vehicleBean.isTokenGiven }" />
		</div>
		<div style="float: left; width: 250px; clear: left;">
			<label>Is MonthlyPass</label>
		</div>
		<div>
			<input type="checkbox" value="${vehicleBean.isMonthlyPass }" />
		</div>
	</div>
</body>
</html>