DESCRIPTION = "ROS messages for publishing graphs of different data types"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs std-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/davetcoleman/graph_msgs-release/archive/release/melodic/graph_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8a3dd97d947b4bd5fbce683a80ad2916"
SRC_URI[sha256sum] = "90eea30842973033f2e20449457a89b871d1a66249113b2a423da84f45b4ff0a"

S = "${WORKDIR}/graph_msgs-release-release-melodic-graph_msgs-0.1.0-0"

inherit catkin
