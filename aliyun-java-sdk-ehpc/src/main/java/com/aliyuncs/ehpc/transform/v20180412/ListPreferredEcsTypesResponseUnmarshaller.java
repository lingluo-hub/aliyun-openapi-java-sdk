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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListPreferredEcsTypesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListPreferredEcsTypesResponse.SeriesInfo;
import com.aliyuncs.ehpc.model.v20180412.ListPreferredEcsTypesResponse.SeriesInfo.Roles;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPreferredEcsTypesResponseUnmarshaller {

	public static ListPreferredEcsTypesResponse unmarshall(ListPreferredEcsTypesResponse listPreferredEcsTypesResponse, UnmarshallerContext _ctx) {
		
		listPreferredEcsTypesResponse.setRequestId(_ctx.stringValue("ListPreferredEcsTypesResponse.RequestId"));
		listPreferredEcsTypesResponse.setSupportSpotInstance(_ctx.booleanValue("ListPreferredEcsTypesResponse.SupportSpotInstance"));

		List<SeriesInfo> series = new ArrayList<SeriesInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPreferredEcsTypesResponse.Series.Length"); i++) {
			SeriesInfo seriesInfo = new SeriesInfo();
			seriesInfo.setSeriesName(_ctx.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].SeriesName"));
			seriesInfo.setSeriesId(_ctx.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].SeriesId"));

			Roles roles = new Roles();

			List<String> manager = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Manager.Length"); j++) {
				manager.add(_ctx.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Manager["+ j +"]"));
			}
			roles.setManager(manager);

			List<String> compute = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Compute.Length"); j++) {
				compute.add(_ctx.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Compute["+ j +"]"));
			}
			roles.setCompute(compute);

			List<String> login = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Login.Length"); j++) {
				login.add(_ctx.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Login["+ j +"]"));
			}
			roles.setLogin(login);
			seriesInfo.setRoles(roles);

			series.add(seriesInfo);
		}
		listPreferredEcsTypesResponse.setSeries(series);
	 
	 	return listPreferredEcsTypesResponse;
	}
}