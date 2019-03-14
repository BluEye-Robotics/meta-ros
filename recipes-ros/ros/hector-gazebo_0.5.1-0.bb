DESCRIPTION = "hector_gazebo provides packages related to to simulation of robots using gazebo (gazebo plugins, world files etc. )"
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hector-gazebo-thermal-camera hector-gazebo-worlds hector-gazebo-plugins"

RDEPENDS_${PN} = "hector-gazebo-thermal-camera hector-gazebo-worlds hector-gazebo-plugins"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_gazebo/0.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d67c98efede7ee4ce4d8b4e8087796a5"
SRC_URI[sha256sum] = "e474b78636582cd62c773aa6f4951ee850aa2f1afb3896e93d3a171a7037287f"

S = "${WORKDIR}/hector_gazebo-release-release-melodic-hector_gazebo-0.5.1-0"

inherit catkin
