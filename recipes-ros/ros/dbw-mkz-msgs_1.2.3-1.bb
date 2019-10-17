DESCRIPTION = "Drive-by-wire messages for the Lincoln MKZ"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime rosbag-migration-rule"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_msgs/1.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "25892063b3b4b489c5182a3208be9199"
SRC_URI[sha256sum] = "12caef99ae83fc9711e4422b4c4a86adf5ba988789ec470dea553f650976e4aa"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_msgs-1.2.3-1"

inherit catkin
