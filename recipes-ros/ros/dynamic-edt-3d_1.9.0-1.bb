DESCRIPTION = "The dynamicEDT3D library implements an inrementally updatable Euclidean distance transform (EDT) in 3D. It comes with a wrapper to use the OctoMap 3D representation and hooks into the change detection of the OctoMap library to propagate changes to the EDT."
AUTHOR = "Christoph Sprunk"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "octomap octomap catkin"

RDEPENDS_${PN} = "octomap catkin"

SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/melodic/dynamic_edt_3d/1.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8d93b94001942ea05b80c5eff02f00eb"
SRC_URI[sha256sum] = "b3da422d3baebaea5aa422558b878f02058f7695617e5b116ee7bdf1723c12cc"

ROS_SPN = "octomap"
S = "${WORKDIR}/octomap-release-release-melodic-dynamic_edt_3d-1.9.0-1"

inherit catkin
