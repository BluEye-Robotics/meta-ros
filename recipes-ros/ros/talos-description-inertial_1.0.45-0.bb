DESCRIPTION = "Inertial parameters of talos"
AUTHOR = ""
SECTION = "devel"
LICENSE = "CC-BY-NC-ND-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=c34cc4dbd73e2cebfa3f363105f53fd5"

DEPENDS = ""

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/pal-gbp/talos_robot-release/archive/release/melodic/talos_description_inertial/1.0.45-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4446608de97da3a833c2571c621992f"
SRC_URI[sha256sum] = "03af558efe948f9f6e0babd3a08d1f83819ad86011e25edca8402a9e2bcd8a3a"

ROS_SPN = "talos_robot"
S = "${WORKDIR}/talos_robot-release-release-melodic-talos_description_inertial-1.0.45-0"

inherit catkin
