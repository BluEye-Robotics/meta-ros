DESCRIPTION = "Twist (speed and angular rate) controller for brake/throttle/steering"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs geometry-msgs sensor-msgs dbw-mkz-msgs dynamic-reconfigure"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_twist_controller/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e391f6ad9f674d5921679e868237d0a7"
SRC_URI[sha256sum] = "cdef1fc782da0f8084335f59afe6d4e49d0415b7e5cbd9c3225cef3a8cfdc126"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_twist_controller-1.1.1-0"

inherit catkin
