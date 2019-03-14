DESCRIPTION = "Wrapper interface for tracing libraries"
AUTHOR = "Ingo Luetkebohle"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=7b404913b4819f2321770961dc72a54f"

DEPENDS = "boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/bosch-robotics-cr/tracetools-release/archive/release/melodic/tracetools/0.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8a311734e321056bf799eb3c276f7ba5"
SRC_URI[sha256sum] = "1c5114e1acce416cfb16dfca419508fd9dfcfd682ffdd63eafbe7a609d5f14f7"

S = "${WORKDIR}/tracetools-release-release-melodic-tracetools-0.2.1-1"

inherit catkin
