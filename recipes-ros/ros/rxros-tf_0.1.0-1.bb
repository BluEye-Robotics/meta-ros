DESCRIPTION = "Extensions to RxROS for working with TF."
AUTHOR = "Henrik Larsen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rxros tf rxros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/rosin-project/rxros-release/archive/release/melodic/rxros_tf/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6b6315c918326b840fb4c549521b3f68"
SRC_URI[sha256sum] = "dc14d6a0fb3706f25cbad9696e1b39a5e9b16f44be6f8f827a13aa5833bbe355"

ROS_SPN = "rxros"
S = "${WORKDIR}/rxros-release-release-melodic-rxros_tf-0.1.0-1"

inherit catkin
