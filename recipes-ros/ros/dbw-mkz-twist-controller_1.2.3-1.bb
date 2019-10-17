DESCRIPTION = "Twist (speed and angular rate) controller for brake/throttle/steering"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs geometry-msgs sensor-msgs dbw-mkz-msgs dynamic-reconfigure"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_twist_controller/1.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f53f421aa0966490d0a859bdae2ccb4"
SRC_URI[sha256sum] = "79d02132a2fa17b12ff0dcb521c4565f0d4cfe71819803110f1eb8262a77dc09"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_twist_controller-1.2.3-1"

inherit catkin
