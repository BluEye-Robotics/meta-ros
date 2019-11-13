DESCRIPTION = "The RxROS package"
AUTHOR = "Henrik Larsen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rxcpp-vendor roscpp rxcpp-vendor"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/rosin-project/rxros-release/archive/release/melodic/rxros/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8189a955c82fa3ef98bc83c02142efa5"
SRC_URI[sha256sum] = "ac6bf266d3f1bfbe7be43f5870ba29469fffb094fe4c4bdc8241a128187c6dde"

S = "${WORKDIR}/rxros-release-release-melodic-rxros-0.1.0-1"

inherit catkin
