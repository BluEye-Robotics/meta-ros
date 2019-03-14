DESCRIPTION = "map_server provides the"
AUTHOR = "Brian Gerkey, Tony Pratkanis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "bullet nav-msgs roscpp libsdl-image libsdl-image tf2 yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/map_server/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b19d467c088be4f154ee06756aa42b7d"
SRC_URI[sha256sum] = "bfa8523b9c697f97956d24e89857dcccc5b4cc09844b42adb0ce066c6df28972"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-map_server-1.16.2-0"

inherit catkin
