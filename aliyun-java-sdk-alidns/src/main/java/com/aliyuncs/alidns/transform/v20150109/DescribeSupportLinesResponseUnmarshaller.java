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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeSupportLinesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeSupportLinesResponse.RecordLine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSupportLinesResponseUnmarshaller {

	public static DescribeSupportLinesResponse unmarshall(DescribeSupportLinesResponse describeSupportLinesResponse, UnmarshallerContext _ctx) {
		
		describeSupportLinesResponse.setRequestId(_ctx.stringValue("DescribeSupportLinesResponse.RequestId"));

		List<RecordLine> recordLines = new ArrayList<RecordLine>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSupportLinesResponse.RecordLines.Length"); i++) {
			RecordLine recordLine = new RecordLine();
			recordLine.setFatherCode(_ctx.stringValue("DescribeSupportLinesResponse.RecordLines["+ i +"].FatherCode"));
			recordLine.setLineDisplayName(_ctx.stringValue("DescribeSupportLinesResponse.RecordLines["+ i +"].LineDisplayName"));
			recordLine.setLineCode(_ctx.stringValue("DescribeSupportLinesResponse.RecordLines["+ i +"].LineCode"));
			recordLine.setLineName(_ctx.stringValue("DescribeSupportLinesResponse.RecordLines["+ i +"].LineName"));

			recordLines.add(recordLine);
		}
		describeSupportLinesResponse.setRecordLines(recordLines);
	 
	 	return describeSupportLinesResponse;
	}
}