DESCRIPTION = "This package specifies the interface to a realtime controller. A controller that implements this interface can be executed by the"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp pr2-mechanism-model controller-interface roscpp pr2-mechanism-model controller-interface"

RDEPENDS_${PN} = "roscpp pr2-mechanism-model controller-interface"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_controller_interface/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4084084a1df93084b87175a077c1e627"
SRC_URI[sha256sum] = "0a6ffaecfd981a9b21e8895ac582bff371da30a6526c97a933827b9a97bf7607"

ROS_SPN = "pr2_mechanism"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_controller_interface-1.8.18-0"

inherit catkin
