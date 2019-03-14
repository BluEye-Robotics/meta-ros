DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "ros-base rqt-common-plugins rqt-robot-plugins"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/viz/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61ed77572639070a13be1a1a67c4daf2"
SRC_URI[sha256sum] = "c2cdc23508adf393957c192b8d62b0278260342d34dbcc58a3bac3abbd61dcf4"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-viz-1.4.1-0"

inherit catkin
