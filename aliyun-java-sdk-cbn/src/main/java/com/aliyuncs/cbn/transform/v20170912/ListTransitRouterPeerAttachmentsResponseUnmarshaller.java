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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterPeerAttachmentsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterPeerAttachmentsResponseUnmarshaller {

	public static ListTransitRouterPeerAttachmentsResponse unmarshall(ListTransitRouterPeerAttachmentsResponse listTransitRouterPeerAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterPeerAttachmentsResponse.setRequestId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.RequestId"));
		listTransitRouterPeerAttachmentsResponse.setNextToken(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.NextToken"));
		listTransitRouterPeerAttachmentsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterPeerAttachmentsResponse.TotalCount"));
		listTransitRouterPeerAttachmentsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterPeerAttachmentsResponse.MaxResults"));

		List<TransitRouterAttachment> transitRouterAttachments = new ArrayList<TransitRouterAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments.Length"); i++) {
			TransitRouterAttachment transitRouterAttachment = new TransitRouterAttachment();
			transitRouterAttachment.setCreationTime(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].CreationTime"));
			transitRouterAttachment.setStatus(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].Status"));
			transitRouterAttachment.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentId"));
			transitRouterAttachment.setBandwidthType(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].BandwidthType"));
			transitRouterAttachment.setCenBandwidthPackageId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].CenBandwidthPackageId"));
			transitRouterAttachment.setTransitRouterAttachmentDescription(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentDescription"));
			transitRouterAttachment.setRegionId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].RegionId"));
			transitRouterAttachment.setPeerTransitRouterId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].PeerTransitRouterId"));
			transitRouterAttachment.setBandwidthPackageId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].BandwidthPackageId"));
			transitRouterAttachment.setTransitRouterId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterId"));
			transitRouterAttachment.setPeerTransitRouterRegionId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].PeerTransitRouterRegionId"));
			transitRouterAttachment.setResourceType(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].ResourceType"));
			transitRouterAttachment.setBandwidth(_ctx.integerValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].Bandwidth"));
			transitRouterAttachment.setGeographicSpanId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].GeographicSpanId"));
			transitRouterAttachment.setPeerTransitRouterOwnerId(_ctx.longValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].PeerTransitRouterOwnerId"));
			transitRouterAttachment.setAutoPublishRouteEnabled(_ctx.booleanValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].AutoPublishRouteEnabled"));
			transitRouterAttachment.setTransitRouterAttachmentName(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentName"));

			transitRouterAttachments.add(transitRouterAttachment);
		}
		listTransitRouterPeerAttachmentsResponse.setTransitRouterAttachments(transitRouterAttachments);
	 
	 	return listTransitRouterPeerAttachmentsResponse;
	}
}