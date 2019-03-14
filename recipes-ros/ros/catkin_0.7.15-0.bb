DESCRIPTION = "Low-level build system macros and infrastructure for ROS."
AUTHOR = "Troy Straszheim"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy  python-catkin-pkg gmock gtest python-empy python-nose"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/catkin-release/archive/release/melodic/catkin/0.7.15-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e3e8cc82ba74a6b6e8a955152541d158"
SRC_URI[sha256sum] = "5f33035a608757197a2eb8293ea9d707d58e1da826e3902a10b68059679ecd04"

S = "${WORKDIR}/catkin-release-release-melodic-catkin-0.7.15-0"

inherit catkin
