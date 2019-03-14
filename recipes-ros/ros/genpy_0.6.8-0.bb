DESCRIPTION = "Python ROS message and service generators."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg genmsg python-pyyaml"

RDEPENDS_${PN} = "genmsg python-pyyaml"

SRC_URI = "https://github.com/ros-gbp/genpy-release/archive/release/melodic/genpy/0.6.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61e4af448e6c71b05a7a61702ced9097"
SRC_URI[sha256sum] = "22a962f2463d4a60fa0caefe4377195f0f294481af0736f68d50034461648844"

S = "${WORKDIR}/genpy-release-release-melodic-genpy-0.6.8-0"

inherit catkin
