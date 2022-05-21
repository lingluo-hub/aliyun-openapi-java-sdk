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

package com.aliyuncs.imagerecog.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imagerecog.model.v20190930.TaggingAdImageResponse;
import com.aliyuncs.imagerecog.model.v20190930.TaggingAdImageResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.TaggingAdImageResponse.Data.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaggingAdImageResponseUnmarshaller {

	public static TaggingAdImageResponse unmarshall(TaggingAdImageResponse taggingAdImageResponse, UnmarshallerContext _ctx) {
		
		taggingAdImageResponse.setRequestId(_ctx.stringValue("TaggingAdImageResponse.RequestId"));
		taggingAdImageResponse.setCode(_ctx.stringValue("TaggingAdImageResponse.Code"));
		taggingAdImageResponse.setMessage(_ctx.stringValue("TaggingAdImageResponse.Message"));

		Data data = new Data();
		data.setTagInfo(_ctx.mapValue("TaggingAdImageResponse.Data.TagInfo"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("TaggingAdImageResponse.Data.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setValue(_ctx.stringValue("TaggingAdImageResponse.Data.Tags["+ i +"].Value"));
			tagsItem.setConfidence(_ctx.floatValue("TaggingAdImageResponse.Data.Tags["+ i +"].Confidence"));

			tags.add(tagsItem);
		}
		data.setTags(tags);
		taggingAdImageResponse.setData(data);
	 
	 	return taggingAdImageResponse;
	}
}