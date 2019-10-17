DESCRIPTION = "multi_map_server provides the"
AUTHOR = "Manabu Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "map-server nav-msgs rosconsole roscpp rospy tf python3-imaging python3-pyyaml yaml-cpp libsdl-image jsk-tools rosmake map-server nav-msgs rosconsole roscpp rospy tf yaml-cpp libsdl-image"

RDEPENDS_${PN} = "map-server nav-msgs rosconsole roscpp rospy tf yaml-cpp libsdl-image"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/multi_map_server/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0d7bd6da0beefe56f590c42e2b77d4de"
SRC_URI[sha256sum] = "eda76ab35d2eab0ecd8663973eaa2269cad69e1b4b5bb1e0f3b30594fabd9c42"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-multi_map_server-2.2.10-0"

inherit catkin
