/*
 * Copyright (c) 2016 DT-Dream, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.ovsdb.schema.ovnnb;
import java.util.Map;
import java.util.Set;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.notation.UUID;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;

/**
 * This class is a typed interface to the Logical_Router_Static_Route Table
 */
@TypedTable(name="Logical_Router_Static_Route", database="OVN_Northbound", fromVersion="1.0.0")
public interface Logical_Router_Static_Route extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="ip_prefix", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getIpPrefixColumn();
    @TypedColumn(name="ip_prefix", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setIpPrefix(String ip_prefix);

    @TypedColumn(name="nexthop", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getNextHopColumn();
    @TypedColumn(name="nexthop", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setNexthop(String nexthop);

    @TypedColumn(name="output_port", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getOutputPortColumn();
    @TypedColumn(name="output_port", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setOutputPort(String output_port);

//    FIXME: To be uncommented when NAT supports external_ids column
//    @TypedColumn (name="external_ids", method= MethodType.GETCOLUMN, fromVersion="1.0.0")
//    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
//    @TypedColumn (name="external_ids", method= MethodType.SETDATA, fromVersion="1.0.0")
//    void setExternalIds(Map<String, String> externalIds);

}
