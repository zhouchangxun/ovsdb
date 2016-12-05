/*
 * Copyright (c) 2016 DT-Dream and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.ovsdb.schema.ovnnb;

import java.util.Map;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;

/**
 * This class is a typed interface to the ACL Table
 */
@TypedTable(name="ACL", database="OVN_Northbound", fromVersion="1.0.0")
public interface ACL extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="priority", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Long> getPriorityColumn();
    @TypedColumn(name="priority", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setPriority(Long priority);    // in range 0 to 32,767

    @TypedColumn(name="direction", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getDirectionColumn();
    @TypedColumn(name="direction", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setDirection(String direction);   // either "to-lport" or "from-lport"

    @TypedColumn(name="match", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getMatchColumn();
    @TypedColumn(name="match", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setMatch(String match);   // match expressions for ovn sepc .

    @TypedColumn(name="action", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getActionColumn();
    @TypedColumn(name="action", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setAction(String action);   // one of "allow-related", "drop, allow", or "reject"

    @TypedColumn(name="log", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Boolean> getLogColumn();
    @TypedColumn(name="log", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setLog(Boolean enable);    // Logging is not yet implemented.

    @TypedColumn(name="external_ids", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
    @TypedColumn(name="external_ids", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setExternalIds(Map<String, String> externalIds);

}
