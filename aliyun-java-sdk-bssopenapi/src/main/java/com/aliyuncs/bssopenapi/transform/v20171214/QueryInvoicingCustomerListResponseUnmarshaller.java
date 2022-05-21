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

import com.aliyuncs.bssopenapi.model.v20171214.QueryInvoicingCustomerListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInvoicingCustomerListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInvoicingCustomerListResponse.Data.CustomerInvoice;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInvoicingCustomerListResponseUnmarshaller {

	public static QueryInvoicingCustomerListResponse unmarshall(QueryInvoicingCustomerListResponse queryInvoicingCustomerListResponse, UnmarshallerContext _ctx) {
		
		queryInvoicingCustomerListResponse.setRequestId(_ctx.stringValue("QueryInvoicingCustomerListResponse.RequestId"));
		queryInvoicingCustomerListResponse.setCode(_ctx.stringValue("QueryInvoicingCustomerListResponse.Code"));
		queryInvoicingCustomerListResponse.setMessage(_ctx.stringValue("QueryInvoicingCustomerListResponse.Message"));
		queryInvoicingCustomerListResponse.setSuccess(_ctx.booleanValue("QueryInvoicingCustomerListResponse.Success"));

		Data data = new Data();

		List<CustomerInvoice> customerInvoiceList = new ArrayList<CustomerInvoice>();
		for (int i = 0; i < _ctx.lengthValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList.Length"); i++) {
			CustomerInvoice customerInvoice = new CustomerInvoice();
			customerInvoice.setType(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Type"));
			customerInvoice.setStatus(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Status"));
			customerInvoice.setAdjustType(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].AdjustType"));
			customerInvoice.setBank(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Bank"));
			customerInvoice.setStartCycle(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].StartCycle"));
			customerInvoice.setTitleChangeInstructions(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].TitleChangeInstructions"));
			customerInvoice.setUserId(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].UserId"));
			customerInvoice.setOperatingLicenseAddress(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].OperatingLicenseAddress"));
			customerInvoice.setInvoiceTitle(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].InvoiceTitle"));
			customerInvoice.setUserNick(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].UserNick"));
			customerInvoice.setOperatingLicensePhone(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].OperatingLicensePhone"));
			customerInvoice.setEndCycle(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].EndCycle"));
			customerInvoice.setDefaultRemark(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].DefaultRemark"));
			customerInvoice.setTaxationLicense(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].TaxationLicense"));
			customerInvoice.setRegisterNo(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].RegisterNo"));
			customerInvoice.setGmtCreate(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].GmtCreate"));
			customerInvoice.setTaxpayerType(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].TaxpayerType"));
			customerInvoice.setCustomerType(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].CustomerType"));
			customerInvoice.setIssueType(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].IssueType"));
			customerInvoice.setId(_ctx.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Id"));
			customerInvoice.setBankNo(_ctx.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].BankNo"));

			customerInvoiceList.add(customerInvoice);
		}
		data.setCustomerInvoiceList(customerInvoiceList);
		queryInvoicingCustomerListResponse.setData(data);
	 
	 	return queryInvoicingCustomerListResponse;
	}
}