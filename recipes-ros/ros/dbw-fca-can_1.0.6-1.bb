DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Chrysler Pacifica DBW kit"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy roscpp nodelet std-msgs geometry-msgs sensor-msgs can-msgs dbw-fca-msgs"

RDEPENDS_${PN} = "roslaunch dataspeed-can-usb dbw-fca-description dataspeed-ulc-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_can/1.0.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b84f54a809aabbad704d6af32689386d"
SRC_URI[sha256sum] = "af20f55d7125879bc0b6728be7a12e1c0927d91c947d3722d2753b526201915d"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_can-1.0.6-1"

inherit catkin
