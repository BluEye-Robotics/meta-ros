DESCRIPTION = "Wraps FMUs for co-simulation"
AUTHOR = "Ralph Lange"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "roscpp std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/boschresearch/fmi_adapter-release/archive/release/melodic/fmi_adapter/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7de6e181ed741ff2c6e5c13b4ecbea59"
SRC_URI[sha256sum] = "bfe24f7aa9671c953277071e419fc78de19d4ff33b5342fb7aef9e0b8f964f49"

S = "${WORKDIR}/fmi_adapter-release-release-melodic-fmi_adapter-1.0.2-0"

inherit catkin
