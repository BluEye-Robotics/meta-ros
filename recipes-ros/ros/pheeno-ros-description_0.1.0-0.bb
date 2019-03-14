DESCRIPTION = "The pheeno_ros_description package"
AUTHOR = "Zahi Kakish"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdf xacro urdf xacro"

RDEPENDS_${PN} = "urdf xacro"

SRC_URI = "https://github.com/acslaboratory/pheeno_ros_description-release/archive/release/melodic/pheeno_ros_description/0.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "77af26e75f90d5cae65938b0a2ac3481"
SRC_URI[sha256sum] = "4849cdf4250dfdbd134a913bd739e1b2647446a89eb50a6dde59bdbc9632019c"

S = "${WORKDIR}/pheeno_ros_description-release-release-melodic-pheeno_ros_description-0.1.0-0"

inherit catkin
