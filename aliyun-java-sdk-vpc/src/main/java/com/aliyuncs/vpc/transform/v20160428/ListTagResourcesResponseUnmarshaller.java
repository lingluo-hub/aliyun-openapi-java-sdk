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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListTagResourcesResponse;
import com.aliyuncs.vpc.model.v20160428.ListTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setNextToken(_ctx.stringValue("ListTagResourcesResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourcId(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourcId"));
			tagResource.setResourceType(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setTagValue(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagValue"));
			tagResource.setResourceId(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setTagKey(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagKey"));

			tagResources.add(tagResource);
		}
		listTagResourcesResponse.setTagResources(tagResources);
	 
	 	return listTagResourcesResponse;
	}
}