DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization and mapping (SLAM) in 2D and 3D across multiple platforms and sensor configurations."
AUTHOR = "The Cartographer Authors"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "g++-static gmock python3-sphinx boost libeigen libcairo2-dev libceres-dev libgflags-dev libgoogle-glog-dev lua5.2-dev protobuf-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/cartographer-release/archive/release/melodic/cartographer/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ca92001e1304adf231b6880929aa37f"
SRC_URI[sha256sum] = "899b883a05a2644553c5b5347b650f30cca59a3388fe14b6728486b0dcb77924"

S = "${WORKDIR}/cartographer-release-release-melodic-cartographer-1.0.0-0"

inherit catkin
