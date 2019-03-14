DESCRIPTION = "Catkin wrapper for the official ARSDK from Parrot"
AUTHOR = "Parrot S.A."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "automake autoconf libtool yasm nasm zlib unzip curl ffmpeg libncurses-dev libavahi-client-dev libavahi-core-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/AutonomyLab/parrot_arsdk-release/archive/release/melodic/parrot_arsdk/3.14.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dfb7956fd47a2a26e020355daacc9de5"
SRC_URI[sha256sum] = "7c12a877881ee154fb0899c3b8d365276cb5c7afc319859078e610ec06f66ec1"

S = "${WORKDIR}/parrot_arsdk-release-release-melodic-parrot_arsdk-3.14.1-0"

inherit catkin
