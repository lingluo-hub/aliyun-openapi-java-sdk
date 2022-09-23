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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainCnameResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainCnameResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainCnameResponseUnmarshaller {

	public static DescribeDcdnDomainCnameResponse unmarshall(DescribeDcdnDomainCnameResponse describeDcdnDomainCnameResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainCnameResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainCnameResponse.RequestId"));

		List<Data> cnameDatas = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainCnameResponse.CnameDatas.Length"); i++) {
			Data data = new Data();
			data.setStatus(_ctx.integerValue("DescribeDcdnDomainCnameResponse.CnameDatas["+ i +"].Status"));
			data.setDomain(_ctx.stringValue("DescribeDcdnDomainCnameResponse.CnameDatas["+ i +"].Domain"));
			data.setCname(_ctx.stringValue("DescribeDcdnDomainCnameResponse.CnameDatas["+ i +"].Cname"));

			cnameDatas.add(data);
		}
		describeDcdnDomainCnameResponse.setCnameDatas(cnameDatas);
	 
	 	return describeDcdnDomainCnameResponse;
	}
}