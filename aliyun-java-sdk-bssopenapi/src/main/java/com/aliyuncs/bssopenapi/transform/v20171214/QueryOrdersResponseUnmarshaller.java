/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryOrdersResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryOrdersResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryOrdersResponse.Data.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrdersResponseUnmarshaller {

	public static QueryOrdersResponse unmarshall(QueryOrdersResponse queryOrdersResponse, UnmarshallerContext _ctx) {
		
		queryOrdersResponse.setRequestId(_ctx.stringValue("QueryOrdersResponse.RequestId"));
		queryOrdersResponse.setCode(_ctx.stringValue("QueryOrdersResponse.Code"));
		queryOrdersResponse.setMessage(_ctx.stringValue("QueryOrdersResponse.Message"));
		queryOrdersResponse.setSuccess(_ctx.booleanValue("QueryOrdersResponse.Success"));

		Data data = new Data();
		data.setHostName(_ctx.stringValue("QueryOrdersResponse.Data.HostName"));
		data.setPageNum(_ctx.integerValue("QueryOrdersResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryOrdersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryOrdersResponse.Data.TotalCount"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrdersResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setPretaxAmount(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PretaxAmount"));
			order.setCommodityCode(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].CommodityCode"));
			order.setRelatedOrderId(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].RelatedOrderId"));
			order.setCreateTime(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].CreateTime"));
			order.setCurrency(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].Currency"));
			order.setSubscriptionType(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].SubscriptionType"));
			order.setPaymentCurrency(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PaymentCurrency"));
			order.setProductType(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].ProductType"));
			order.setAfterTaxAmount(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].AfterTaxAmount"));
			order.setPaymentTime(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PaymentTime"));
			order.setPretaxGrossAmount(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PretaxGrossAmount"));
			order.setOrderType(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].OrderType"));
			order.setPaymentStatus(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PaymentStatus"));
			order.setOrderId(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].OrderId"));
			order.setTax(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].Tax"));
			order.setPretaxAmountLocal(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PretaxAmountLocal"));
			order.setProductCode(_ctx.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].ProductCode"));

			orderList.add(order);
		}
		data.setOrderList(orderList);
		queryOrdersResponse.setData(data);
	 
	 	return queryOrdersResponse;
	}
}