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

package com.aliyuncs.cs.model.v20151215;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeClusterAddonsVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterAddonsVersionResponse extends AcsResponse {

	private Map<Object,Object> addonsName;

	public Map<Object,Object> getAddonsName() {
		return this.addonsName;
	}

	public void setAddonsName(Map<Object,Object> addonsName) {
		this.addonsName = addonsName;
	}

	@Override
	public DescribeClusterAddonsVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterAddonsVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
