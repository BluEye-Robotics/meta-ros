DESCRIPTION = "This package wraps the libm5api to use it as a ros dependency. Original sources from http://www. schunk-modular-robotics. com/fileadmin/user_upload/software/schunk_libm5api_source. zip."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "libntcan libpcan"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_libm5api/0.6.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "54ea36962e5c8268a27ffc86fb29919a"
SRC_URI[sha256sum] = "e343d467eeaa11ed11bdd9940c51aa9a1dd4c1965610423e77b41cb18c5a80a7"

ROS_SPN = "schunk_modular_robotics"
S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_libm5api-0.6.13-2"

inherit catkin
