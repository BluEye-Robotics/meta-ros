DESCRIPTION = "Metapackage for igvc_self_drive_sim"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "igvc-self-drive-gazebo igvc-self-drive-gazebo-plugins igvc-self-drive-description"

SRC_URI = "https://github.com/robustify/igvc_self_drive_sim-release/archive/release/melodic/igvc_self_drive_sim/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "009576e58ad6366f68841abaeae66764"
SRC_URI[sha256sum] = "8a843a920d6ffe9cb3c37a6c3e9b07e993aa0373599583f68304e5827883e214"

S = "${WORKDIR}/igvc_self_drive_sim-release-release-melodic-igvc_self_drive_sim-0.1.4-1"

inherit catkin
