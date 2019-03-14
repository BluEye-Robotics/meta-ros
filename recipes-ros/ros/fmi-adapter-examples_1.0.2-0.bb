DESCRIPTION = "Provides small examples for use of the fmi_adapter package"
AUTHOR = "Ralph Lange"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""

RDEPENDS_${PN} = "fmi-adapter roscpp rqt-plot"

SRC_URI = "https://github.com/boschresearch/fmi_adapter-release/archive/release/melodic/fmi_adapter_examples/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf0a8c917e1e939f95318b8efcdb063c"
SRC_URI[sha256sum] = "0cbc8b65bfcc5cd1c06eb8159dd090a7e4dd569e9f4d34a9de8e6258cee1514d"

ROS_SPN = "fmi_adapter"
S = "${WORKDIR}/fmi_adapter-release-release-melodic-fmi_adapter_examples-1.0.2-0"

inherit catkin
