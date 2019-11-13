DESCRIPTION = "Drive-by-wire messages for the Chrysler Pacifica"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime rosbag-migration-rule"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_msgs/1.0.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "913fe7239f95569f36ac5091caf3b4ea"
SRC_URI[sha256sum] = "1d6724bac0b0d14312065b87d7ae4ec4bc2645ec563eef12570af9e2317b0f53"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_msgs-1.0.6-1"

inherit catkin
