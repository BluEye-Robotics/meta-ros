DESCRIPTION = "Drive-by-wire messages for the Lincoln MKZ"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime rosbag-migration-rule"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_msgs/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49d3dd864602dfdd3a1614db296696ba"
SRC_URI[sha256sum] = "e8dedab69c722847607dbbd6cb5f5d0f3270e023f450f76251852b0e36cd154d"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_msgs-1.1.1-0"

inherit catkin
