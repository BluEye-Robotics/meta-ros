DESCRIPTION = "This packages provides a configurable driver of a chain of Schunk powercubes. The powercube chain is configured through parameters. Most users will not directly interact with this package but with the corresponding launch files in other packages, e. g. schunk_bringup, cob_bringup, . . ."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-srvs control-msgs diagnostic-msgs libntcan libpcan linux-headers-generic roscpp schunk-libm5api sensor-msgs std-msgs std-srvs trajectory-msgs urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_powercube_chain/0.6.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "df3e642f6f2179e0d5264420a84515a2"
SRC_URI[sha256sum] = "805d6614d5110463ddd7871aea6cff7460d8200a572feaf35f003a31475939c2"

ROS_SPN = "schunk_modular_robotics"
S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_powercube_chain-0.6.13-2"

inherit catkin
