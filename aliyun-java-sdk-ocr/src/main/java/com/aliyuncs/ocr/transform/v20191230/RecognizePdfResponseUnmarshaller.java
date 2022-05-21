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

package com.aliyuncs.ocr.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizePdfResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizePdfResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizePdfResponse.Data.WordsInfoItem;
import com.aliyuncs.ocr.model.v20191230.RecognizePdfResponse.Data.WordsInfoItem.PositionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizePdfResponseUnmarshaller {

	public static RecognizePdfResponse unmarshall(RecognizePdfResponse recognizePdfResponse, UnmarshallerContext _ctx) {
		
		recognizePdfResponse.setRequestId(_ctx.stringValue("RecognizePdfResponse.RequestId"));
		recognizePdfResponse.setCode(_ctx.stringValue("RecognizePdfResponse.Code"));
		recognizePdfResponse.setMessage(_ctx.stringValue("RecognizePdfResponse.Message"));

		Data data = new Data();
		data.setHeight(_ctx.longValue("RecognizePdfResponse.Data.Height"));
		data.setWidth(_ctx.longValue("RecognizePdfResponse.Data.Width"));
		data.setOrgHeight(_ctx.longValue("RecognizePdfResponse.Data.OrgHeight"));
		data.setOrgWidth(_ctx.longValue("RecognizePdfResponse.Data.OrgWidth"));
		data.setPageIndex(_ctx.longValue("RecognizePdfResponse.Data.PageIndex"));
		data.setAngle(_ctx.longValue("RecognizePdfResponse.Data.Angle"));

		List<WordsInfoItem> wordsInfo = new ArrayList<WordsInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizePdfResponse.Data.WordsInfo.Length"); i++) {
			WordsInfoItem wordsInfoItem = new WordsInfoItem();
			wordsInfoItem.setAngle(_ctx.longValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Angle"));
			wordsInfoItem.setWord(_ctx.stringValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Word"));
			wordsInfoItem.setHeight(_ctx.longValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Height"));
			wordsInfoItem.setWidth(_ctx.longValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Width"));
			wordsInfoItem.setX(_ctx.longValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].X"));
			wordsInfoItem.setY(_ctx.longValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Y"));

			List<PositionsItem> positions = new ArrayList<PositionsItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Positions.Length"); j++) {
				PositionsItem positionsItem = new PositionsItem();
				positionsItem.setX(_ctx.longValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Positions["+ j +"].X"));
				positionsItem.setY(_ctx.longValue("RecognizePdfResponse.Data.WordsInfo["+ i +"].Positions["+ j +"].Y"));

				positions.add(positionsItem);
			}
			wordsInfoItem.setPositions(positions);

			wordsInfo.add(wordsInfoItem);
		}
		data.setWordsInfo(wordsInfo);
		recognizePdfResponse.setData(data);
	 
	 	return recognizePdfResponse;
	}
}