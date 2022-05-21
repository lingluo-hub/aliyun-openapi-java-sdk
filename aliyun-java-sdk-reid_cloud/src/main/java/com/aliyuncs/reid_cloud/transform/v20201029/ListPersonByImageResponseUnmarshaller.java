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

package com.aliyuncs.reid_cloud.transform.v20201029;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid_cloud.model.v20201029.ListPersonByImageResponse;
import com.aliyuncs.reid_cloud.model.v20201029.ListPersonByImageResponse.PersonSearchResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonByImageResponseUnmarshaller {

	public static ListPersonByImageResponse unmarshall(ListPersonByImageResponse listPersonByImageResponse, UnmarshallerContext _ctx) {
		
		listPersonByImageResponse.setRequestId(_ctx.stringValue("ListPersonByImageResponse.RequestId"));
		listPersonByImageResponse.setErrorCode(_ctx.stringValue("ListPersonByImageResponse.ErrorCode"));
		listPersonByImageResponse.setErrorMessage(_ctx.stringValue("ListPersonByImageResponse.ErrorMessage"));
		listPersonByImageResponse.setMessage(_ctx.stringValue("ListPersonByImageResponse.Message"));
		listPersonByImageResponse.setCode(_ctx.stringValue("ListPersonByImageResponse.Code"));
		listPersonByImageResponse.setDynamicCode(_ctx.stringValue("ListPersonByImageResponse.DynamicCode"));
		listPersonByImageResponse.setSuccess(_ctx.booleanValue("ListPersonByImageResponse.Success"));
		listPersonByImageResponse.setDynamicMessage(_ctx.stringValue("ListPersonByImageResponse.DynamicMessage"));

		List<PersonSearchResultItem> personSearchResultItems = new ArrayList<PersonSearchResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonByImageResponse.PersonSearchResultItems.Length"); i++) {
			PersonSearchResultItem personSearchResultItem = new PersonSearchResultItem();
			personSearchResultItem.setUkId(_ctx.longValue("ListPersonByImageResponse.PersonSearchResultItems["+ i +"].UkId"));
			personSearchResultItem.setScore(_ctx.floatValue("ListPersonByImageResponse.PersonSearchResultItems["+ i +"].Score"));

			personSearchResultItems.add(personSearchResultItem);
		}
		listPersonByImageResponse.setPersonSearchResultItems(personSearchResultItems);
	 
	 	return listPersonByImageResponse;
	}
}