DESCRIPTION = "Listens on a ImageFeatures topic, and waits for the data to settle. This package is experimental and unstable. Expect its APIs to change."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs rosconsole roscpp-serialization settlerlib std-msgs actionlib actionlib-msgs rosconsole roscpp-serialization settlerlib std-msgs"

RDEPENDS_${PN} = "actionlib actionlib-msgs rosconsole roscpp-serialization settlerlib std-msgs"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/monocam_settler/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4ae91876c0e6c619b66ca28af2e5b4dd"
SRC_URI[sha256sum] = "e071a63f48ee1ed211bca1e5bcd85a46afce004dc18ba4226aee484dc7e309c7"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-monocam_settler-0.10.14-0"

inherit catkin
