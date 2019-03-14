DESCRIPTION = "GenICam/GigE Vision Convenience Layer. This package combines the Roboception convenience layer for images with the GenICam reference implementation and a GigE Vision transport layer. It is a self contained package that permits configuration and image streaming of GenICam / GigE Vision 2. 0 compatible cameras like the Roboception rc_visard. This package also provides some tools that can be called from the command line for discovering cameras, changing their configuration and streaming images. Although the tools are meant to be useful when working in a shell or in a script, their main purpose is to serve as example on how to use the API for reading and setting parameters, streaming and synchronizing images. See LICENSE. md for licensing terms of the different parts."
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=27;endline=27;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/roboception-gbp/rc_genicam_api-release/archive/release/melodic/rc_genicam_api/2.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5943e86bc80c47d858b6ffa112891132"
SRC_URI[sha256sum] = "eac83cc05a1e39716b5839146c3b15098ea1071599b783a4243af3f922cd4987"

S = "${WORKDIR}/rc_genicam_api-release-release-melodic-rc_genicam_api-2.1.0-0"

inherit catkin
