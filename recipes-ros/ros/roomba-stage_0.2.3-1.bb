DESCRIPTION = "The roomba_stage package"
AUTHOR = "Gonçalo Cabrita"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "fake-localization map-server move-base stage-ros"

RDEPENDS_${PN} = "fake-localization map-server move-base stage-ros"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/roomba_stage/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6c6458d8373fe304d37960049a72a809"
SRC_URI[sha256sum] = "3eb6f70b0f7abdfe001d4ca9ce4c387b8604bbd788a4c11ccd2d8a4c3a79e433"

ROS_SPN = "navigation_tutorials"
S = "${WORKDIR}/navigation_tutorials-release-release-melodic-roomba_stage-0.2.3-1"

inherit catkin
