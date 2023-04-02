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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApisResponse.PurchasedApi;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePurchasedApisResponseUnmarshaller {

	public static DescribePurchasedApisResponse unmarshall(DescribePurchasedApisResponse describePurchasedApisResponse, UnmarshallerContext _ctx) {
		
		describePurchasedApisResponse.setRequestId(_ctx.stringValue("DescribePurchasedApisResponse.RequestId"));
		describePurchasedApisResponse.setPageNumber(_ctx.integerValue("DescribePurchasedApisResponse.PageNumber"));
		describePurchasedApisResponse.setPageSize(_ctx.integerValue("DescribePurchasedApisResponse.PageSize"));
		describePurchasedApisResponse.setTotalCount(_ctx.integerValue("DescribePurchasedApisResponse.TotalCount"));

		List<PurchasedApi> purchasedApis = new ArrayList<PurchasedApi>();
		for (int i = 0; i < _ctx.lengthValue("DescribePurchasedApisResponse.PurchasedApis.Length"); i++) {
			PurchasedApi purchasedApi = new PurchasedApi();
			purchasedApi.setVisibility(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].Visibility"));
			purchasedApi.setPurchasedTime(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].PurchasedTime"));
			purchasedApi.setApiId(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].ApiId"));
			purchasedApi.setModifiedTime(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].ModifiedTime"));
			purchasedApi.setDescription(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].Description"));
			purchasedApi.setGroupName(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].GroupName"));
			purchasedApi.setGroupId(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].GroupId"));
			purchasedApi.setDeployedTime(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].DeployedTime"));
			purchasedApi.setStageName(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].StageName"));
			purchasedApi.setApiName(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].ApiName"));
			purchasedApi.setRegionId(_ctx.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].RegionId"));

			purchasedApis.add(purchasedApi);
		}
		describePurchasedApisResponse.setPurchasedApis(purchasedApis);
	 
	 	return describePurchasedApisResponse;
	}
}