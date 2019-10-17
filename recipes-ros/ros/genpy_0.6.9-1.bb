DESCRIPTION = "Python ROS message and service generators."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg"

RDEPENDS_${PN} = "python-pyyaml python3-pyyaml"

SRC_URI = "https://github.com/ros-gbp/genpy-release/archive/release/melodic/genpy/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3bae1990378e617a7aa5617805954147"
SRC_URI[sha256sum] = "c34ac21b89413514766134f7f7c44b2f59902b0f8cc7c0c751455da86696348b"

S = "${WORKDIR}/genpy-release-release-melodic-genpy-0.6.9-1"

inherit catkin
